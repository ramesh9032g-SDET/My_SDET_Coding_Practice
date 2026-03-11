pipeline {
    agent {
            docker {
                image 'maven:3.9.13-eclipse-temurin-17-noble'
                args '-v /var/run/docker.sock:/var/run/docker.sock'
            }
        }

    environment {
            // This maps your Jenkins credential to a variable
            RP_UUID = credentials('reportportal-uuid')
            RP_ENDPOINT = 'http://host.docker.internal:9090'
            RP_PROJECT = 'superadmin_personal'
        }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/ramesh9032g-SDET/My_SDET_Coding_Practice.git'
            }
        }

      stage('Debug Connection') {
          steps {
              // This checks if the token is valid by asking for project info
              sh """
              curl -v -H "Authorization: Bearer ${RP_UUID}" \
              ${RP_ENDPOINT}/api/v1/project/automation_setup
              """
          }
      }

       stage('Test & Report') {
           steps {
                           // Pass the variables directly into the Maven command
                           sh """
                           mvn test \
                           -Drp.endpoint=${RP_ENDPOINT} \
                           -Drp.api.key=${RP_UUID} \
                           -Drp.uuid=${RP_UUID} \
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