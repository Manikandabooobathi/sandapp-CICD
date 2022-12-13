FROM tomcat:8
# Take the war and copy to webapps of tomcat

COPY target/newapp.war /usr/local/tomcat/webapps/
COPY -R /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps
