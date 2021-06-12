pipeline {
    agent any
    stages {
       stage('Preparation') {
           steps {
               echo 'cleaning'
               echo 'Preparing test run'
            }
        }
        stage('Run tests') {
            steps {
               echo 'Executing tests'
               bat 'mvn clean test -DconfigPath=./env/qa-env.properties -Dwebdriver.chrome.driver=./chromedriver.exe'
            }
        }
        stage('Publishing results') {
          steps{
           step[$class: 'JUnitResultArchiver', checksName: '', testResults: 'pageObject/target/test-reports/*.xml'])
          }
        }
    }
}
