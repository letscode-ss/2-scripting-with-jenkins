pipeline {
    agent { label 'master' }
    stages {
        stage("seed") { 
            steps {
                //prepare maven agent
                script { 
                    container("jnlp") { 
                        jobDsl targets: 'seed.groovy'
                    }                    
                }
            }
        }
    }
}
