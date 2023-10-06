pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                echo "Cloning Repo..."
                git branch: 'main', credentialsId: '91ddaf27-3c31-43a0-b7cd-39ec5e4a248f', url: 'https://github.com/ajinkyarode/Selenium-TestNG-Jenkins-Builds.git'
            }
        }
        stage('Execute Functional Test') {
            steps {
              bat '''
              cd "C:\\Users\\ajink\\eclipse-workspace\\Demo\\TestNGSample"
              java -cp "**/bin;**/lib/*" org.testng.TestNG "testng.xml"
              '''
            }
        }
        stage('Execute Dummy Test') {
            steps {
              echo "Dummy Test"
            }
        }
        stage('Publish Test Reports') {
            steps {
              echo "Test Complete"
            }
        }
        

    }
}