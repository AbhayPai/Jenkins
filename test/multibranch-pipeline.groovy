pipeline {
   agent any

   stages {
      stage('Build 1') {
         steps {
            echo 'Build 1'
         }
      }

      stage('Build 2') {
         steps {
            echo 'Build 2'
         }
      }

      stage('Build 3') {
         steps {
            echo 'Build 3'
         }
      }
   }
}
