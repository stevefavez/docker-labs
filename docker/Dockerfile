FROM jboss/wildfly:latest

USER jboss
RUN /opt/jboss/wildfly/bin/add-user.sh admin Jboss@admin01 --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]