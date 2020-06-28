pipeline {
   agent any

   stages {
      stage('Downloading Code') {
         steps {
            echo 'Downloading Code...'
         }
      }

      stage('Building Application') {
         steps {
            echo 'Building Application...'
         }
      }

      stage('Running Tests in Application') {
         steps {
            echo 'Running Tests in Application...'
         }
      }

      stage('Deploy Application') {
         steps {
            echo 'Deploying Application...'
         }
      }
   }
}
