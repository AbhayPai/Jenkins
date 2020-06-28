pipeline {
  agent any

  stages {
    stage('Downloading App Code') {
      steps {
        echo 'Downloading Code...'
      }
    }

    stage('Building App') {
      steps {
        echo 'Building App...'
      }
    }

    stage('Running Tests inside App') {
      steps {
        echo 'Running Tests inside App...'
      }
    }

    stage('Deploy App') {
      steps {
        echo 'Deploying App...'
      }
    }

    stage('Cleaning Up') {
      steps {
        echo 'Cleaning Up...'
      }
    }
  }
}
