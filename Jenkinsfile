pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/ramesh9032g-SDET/My_SDET_Coding_Practice.git'
            }
        }


    tools {
        maven 'Maven'
        jdk 'JDK17'
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