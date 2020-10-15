pipeline {
    agent { label 'master' }
    stages {
        stage("seed") { 
            steps {
                //prepare maven agent
                script { 
                        jobDsl targets: 'seed.groovy'
                }
            }
        }
    }
}
