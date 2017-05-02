package controllers;

import play.*;
import java.sql.*;

/**
 * Created by Phoenix on 02/17/2017.
 */

public class MySQL {

    // Access for MySQL
    private final static String sqlUrl = "jdbc:mysql://localhost";
    private final static String sqlDBName = "mits";
    private final static String sqlUser = "root";
    private final static String sqlPassword = "Mits@mipe193";


    /**
     * Check if the database connection can be established and if Database exists
     */
    public static void checkDB() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);
            checkTables();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1045) {
                Logger.error("Please check MySQL username or password...");
            } else if (ex.getErrorCode() == 1049) {
                Logger.error("Database " + sqlDBName + " not found. Creating database...");
                initDB();
            } else {
                Logger.error(ex.getMessage());
            }

        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
    }

    /**
     * 
     */
    private static void checkTables() {

    }

    private static void initDB() {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword);
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE DATABASE mits");
            Logger.info("DATABASE mits created");
            initTables();
        } catch (SQLException ex) {

        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
    }

    private static void initTables() {
        // Create Account Tbale
        //createTable("CREATE TABLE account (act_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, email VARCHAR(40), password CHAR(32), salt CHAR(32), signup_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, last_login TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP)");
        createTable("CREATE TABLE account (act_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, email VARCHAR(256), password VARCHAR(32), salt VARCHAR(32))");

        // Create Message Table
        createTable("CREATE TABLE message (post_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, act_id INT, content TEXT, longitude DECIMAL(9,6), latitude DECIMAL(9,6), post_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");

        // Create Audio Table
        createTable("CREATE TABLE audio (post_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, act_id INT, sha1 CHAR(40), longitude DECIMAL(9,6), latitude DECIMAL(9,6), post_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
    }

    private static boolean createTable(String query) {
        Connection conn = null;
        Statement stmt = null;
        boolean success = false;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser,sqlPassword);

            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            success = true;

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("Error creating Table");
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return success;
    }

    /**
     * Add new message to database
     * @param act_id
     * @param content
     * @param longitude
     * @param latitude
     * @return
     */
    public static boolean addMessage(String act_id, String content, double longitude, double latitude) {
        Connection conn = null;
        Statement stmt = null;
        boolean success = false;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO message (act_id, content, longitude, latitude) VALUES('" + act_id + "', '" + content.replace("\n","<br />") + "', '" + longitude + "', '" + latitude + "')");
            success = true;

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error occur when adding message for: " + act_id);
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return success;
    }

    public static boolean addAudio (String act_id, String SHA1, double longitude, double latitude) {
        Connection conn = null;
        Statement stmt = null;
        boolean success = false;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO audio (act_id, sha1, longitude, latitude) VALUES('" + act_id + "', '" + SHA1 + "', '" + longitude + "', '" + latitude + "')");
            success = true;

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error occur when adding audio for: " + act_id);
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return success;
    }

    public static String getMessage() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String message_json = "{ \"messages\":[ ";

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM message");

            while (rs.next()) {
                message_json = message_json + "{\"content\":\"" + rs.getString("content")
                        + "\",\"longitude\":\"" + rs.getDouble("longitude")
                        + "\",\"latitude\":\"" + rs.getDouble("latitude") + "\"},";
            }
        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error getting messages...");
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // ignore
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }

        message_json = message_json.substring(0, message_json.length() - 1) + "]}";
        //Logger.info(message_json);
        return message_json;
    }

    public static String getAudio() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String audio_json = "{ \"audio\":[ ";

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM audio");

            while (rs.next()) {
                audio_json = audio_json + "{\"audio\":\"" + rs.getString("sha1")
                        + "\",\"longitude\":\"" + rs.getDouble("longitude")
                        + "\",\"latitude\":\"" + rs.getDouble("latitude") + "\"},";
            }
        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error getting audio...");
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // ignore
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }

        audio_json = audio_json.substring(0, audio_json.length() - 1) + "]}";
        //Logger.info(message_json);
        return audio_json;
    }


    /**
     * Check if the email is already in the database
     * @param email     Email to be checked
     * @return Boolean that indicates wether the input email already exist in the database
     */
    public static boolean accountExist(String email) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        boolean exist = false;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM account WHERE email = '" + email + "'");

            if (rs.last()) {
                if (rs.getRow() > 0) {
                    exist = true;
                }
            }

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("Error creating Account");
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("Error occur when checking existing email: " + email);
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // ignore
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return exist;
    }

    /**
     * Add new account to database
     * Store email, password, salt to account table
     * @param email     User email
     * @param password  Hashed password
     * @param salt      The salt used in hashing this password
     * @return An integer indicates account ID
     */
    public static int addAccount(String email, String password, String salt) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int act_id = 0;

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();
            // Add email, password, salt to account table
            stmt.executeUpdate("INSERT INTO account (email, password, salt) VALUES('" + email + "', '" + password + "', '" + salt + "')");

            // Get account ID of that email
            rs = stmt.executeQuery("SELECT * FROM account WHERE email = '" + email + "'");
            while (rs.next()) {
                act_id = rs.getInt("act_id");
            }

            // Note to self: discuss whether to handle error here or in account.java or both
            //if (act_id == 0 || act_id == null) {
            //    System.out.println("Error occur when getting act_id");
            //    return ok("Error occur when getting act_id");
            //}

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error occur when adding new user: " + email);
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // ignore
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return act_id;
    }

    /**
     *  Get the password, salt and account ID of the input email
     * @param email     User email
     * @return A size 3 String array with index 0 as password, index 1 as salt and index 2 as account ID
     */
    public static String[] getPassSalt(String email) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String[] passNsalt = new String[3];

        try {
            conn = DriverManager.getConnection(sqlUrl + "/" + sqlDBName + "?useSSL=false", sqlUser, sqlPassword);

            stmt = conn.createStatement();

            // Get password and salt of that email
            rs = stmt.executeQuery("SELECT * FROM account WHERE email = '" + email + "'");
            while (rs.next()) {
                passNsalt[0] = rs.getString("password");
                passNsalt[1] = rs.getString("salt");
                passNsalt[2] = Integer.toString(rs.getInt("act_id"));
            }

        } catch (SQLException ex) {
            // handle any errors
            Logger.error("SQLException: " + ex.getMessage());
            Logger.error("SQLState: " + ex.getSQLState());
            Logger.error("VendorError: " + ex.getErrorCode());
            Logger.error("Error occur when getting passNsalt of email: " + email);
        } catch (Exception e) {
            Logger.error(e.getMessage());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    // ignore
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqlEx) {
                } // ignore

                conn = null;
            }
        }
        return passNsalt;
    }
}