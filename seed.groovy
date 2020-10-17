import jenkins.model.Jenkins
import hudson.*


def jenkinsJob(jobName,repoUrl,credID,jenkinsFile) {
    pipelineJob(jobName).with {
        logRotator(-1, 10, -1, -1) 
        definition {
            cpsScm {
                scm {
                    git {
                        remote {
                            url(repoUrl)
                                credentials(credID)
                            }
                            branch('master')
                        }
                }
                scriptPath(jenkinsFile)
            }
        }
    }
}


def jobMap = ['job-1': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-2': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-3': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-4': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-5': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-6': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-7': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-8': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-9': "https://github.com/configuration-org/2-scripting-with-jenkins.git", 
            'job-10': "https://github.com/configuration-org/2-scripting-with-jenkins.git"]


jobMap.each { job ->
    //Create nexus job
    jenkinsJob( "$job.key","$job.value","github_personal","web-hello-world/Jenkinsfile")
}
