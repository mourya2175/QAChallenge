pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
        jdk "JAVA_HOME"
    }
    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/mourya2175/ModuloChallenge.git'

                // Run Maven on a Unix agent.
               bat "mvn test"
                }
            post {
                // If Maven was able to run the tests, even if some of the test
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
