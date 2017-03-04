FROM jboss/wildfly:latest

ADD docker/customization /opt/jboss/wildfly/customization/
ADD docker/modules /opt/jboss/wildfly/modules/

ADD target/teste-emissao-1.0.0.war /opt/jboss/wildfly/standalone/deployments/teste-emissao.war

CMD ["/opt/jboss/wildfly/customization/execute.sh"]