def call(){
    withSonarQubeEnv('sonarqube') {
        sh """
            mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar -X -Dsonar.projectKey=${testproject} -Dsonar.host.url=${http://10.192.190.152:31506} -Dsonar.java.binaries=* -Dsonar.exclusions=**/*.xml
        """
    }
}
