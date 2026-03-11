pipeline {
    agent {
            docker {
                image 'maven:3.9.13-eclipse-temurin-17-noble'
                args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
        }

    environment {
            // This maps your Jenkins credential to a variable
            RP_UUID = credentials('RP_TOKEN')
            RP_ENDPOINT = 'http://host.docker.internal:9090'
            RP_PROJECT = 'Automation_setup'
        }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/ramesh9032g-SDET/My_SDET_Coding_Practice.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

       stage('Test & Report') {
           steps {
                           // Pass the variables directly into the Maven command
                           sh """
                           mvn test \
                           -Drp.endpoint=${RP_ENDPOINT} \
                           -Drp.api.key=${RP_UUID} \
                           -Drp.project=${RP_PROJECT} \
                           -Drp.launch=Jenkins_Build_${BUILD_NUMBER}
                           -Drp.enabled=true
                           """
                       }
       }
    }
    post {
            always {
                // Keeps your Jenkins test history updated
                junit '**/target/surefire-reports/*.xml'
            }
        }
}