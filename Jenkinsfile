pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
		
		echo 'Hello World'
				
                bat label: '', script: '''cd C:\\Users\\sopal\\.jenkins\\workspace\\HelloWorld\\HelloWorld\\src\\com\\jenkins\\pojo
			       javac Addition.java
			       jar -cvf Addition.jar Addition.class'''
							
                archiveArtifacts artifacts: 'jar,ear', followSymlinks: false
            }
        }
    }
}
