pipeline {
    agent any

    tools {
            maven 'Maven'
            jdk 'JDK17'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/ramesh9032g-SDET/My_SDET_Coding_Practice.git'
            }
        }

       stage('Verify') {
           steps {
               sh 'java -version'
               sh 'mvn -version'
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