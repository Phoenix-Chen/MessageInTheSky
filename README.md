# Message-in-the-Sky
***

### Introduction
***
This project is built using:<br />
[Play Framework](https://www.playframework.com/): Lightweight Java & Scala web framework.<br />
[Bootstrap](http://getbootstrap.com/): HTML, CSS, and JS framework for developing responsive, mobile first projects on the web.<br />
[jQuery](https://jquery.com/): A fast, small, and feature-rich JavaScript library.<br />
[WebGL Earth](https://github.com/webglearth/webglearth2): Open-source virtual planet web application running in any web browser with support for WebGL HTML5 standard.<br />
[Google Cloud Natural Language API](https://cloud.google.com/natural-language/): Google Cloud Natural Language API reveals the structure and meaning of text by offering powerful machine learning models in an easy to use REST API. <br />
[MySQL](https://www.mysql.com/): Open-source relational database management system<br />

Start application by `cd` into the application directory and run command `sbt run` and quits with `crtl-C`.

### Project Structure
***

1. **Backend**
    - Build with Play Framework. Each `.java` file in ***app/controllers*** corresponding to the functions it handles.
2. **Frontend**
    - Build with Bootstrap, jQuery and WebGL Earth.
3. **Database**
    - Build with MySQL. Automatically generated when first starting the application by `MySQL.java` file. Includes ***account***, ***message***, ***audio*** and ***negative_message*** tables.

### Known Issue & Further Development
***
1. We used play framework 2.4 instead of 2.5 due to compatibility issue with one netty library that required by Google NLP API.
2. Ran into several problems when deploy the application onto server. Eventually used [GNU Screen](https://www.gnu.org/software/screen/) to run the application in virtual terminal.
3. Chrome blocks location access for insecure origins. Fix this by applying SSL onto website.
4. Right now, database tables are automatically generated when first starting the application, it is better to check the database and table info whenever start/restart the application then creates/updates specific table.
5. Audio playing issue in safari.
