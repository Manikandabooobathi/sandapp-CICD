FROM tomcat:8
# Take the war and copy to webapps of tomcat

COPY target/newapp.war /usr/local/tomcat/webapps/
COPY /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps
