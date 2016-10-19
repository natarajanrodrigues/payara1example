FROM payara/server-web

COPY target/payara1docker.war /opt/payara41/glassfish/domains/domain1/autodeploy