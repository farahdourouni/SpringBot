pipeline{
  agent any
  stages{
    stage('Compile'){
      steps{
        echo 'Compiling ...'
        sh 'mvn compile'
      }
    }
    stage('Test'){
      steps{
        echo 'Testing...'
        sh 'mvn test'
      }
    }
    stage('Package'){
      steps{
        echo 'Cleaning package...'
        sh 'mvn package'
      }
    }
  }
}
