pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                echo "Cloning Repo..."
                git branch: 'main', credentialsId: '91ddaf27-3c31-43a0-b7cd-39ec5e4a248f', url: 'https://github.com//ajinkyarode//Selenium-TestNG-Jenkins-Builds.git'
            }
        }
        stage('Execute Functional Test') {
            steps {
              bat '''
              cd "C:\\Users\\ajink\\eclipse-workspace\\Demo\\TestNGSample"
              java -cp "C:\\Users\\ajink\\eclipse-workspace\\Demo\\TestNGSample\\bin;C:\\Users\\ajink\\eclipse-workspace\\Demo\\TestNGSample\\lib\\*" org.testng.TestNG testng.xml
              '''
            }
        }
        stage('Execute Dummy Test') {
            steps {
              bat '''C:\\Users\\ajink\\Downloads\\apache-jmeter-5.6.2\\apache-jmeter-5.6.2\\bin\\jmeter.bat -j jmeter.save.saveservice.output_format=xml -n -t "Demo.jmx" -l TestReslt.jtl'''
            }
        }
        stage('Publish Test Reports') {
            steps {
              echo "Test Complete"
            }
        }
        

    }
}