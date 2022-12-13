FROM tomcat:8
# Take the war and copy to webapps of tomcat
ARG war_FILE=/usr/local/tomcat/webapps.dist/*
COPY target/newapp.war /usr/local/tomcat/webapps/
COPY ${war_FILE}  /usr/local/tomcat/webapps
