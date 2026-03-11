pipeline {
    agent {
            docker {
                image 'maven:3.9.13-eclipse-temurin-17-noble'
            }
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

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
