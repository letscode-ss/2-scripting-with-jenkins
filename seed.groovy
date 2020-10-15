import jenkins.model.Jenkins
import hudson.*


def jenkinsJob(jobName,repoUrl,credID,jenkinsFile) {
    pipelineJob(jobName).with {
        parameters {
                stringParam('workSpaceSize', '10', 'In Mbs')
        }
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
            'job-4': "https://github.com/configuration-org/2-scripting-with-jenkins.git"]
def rootFolder = "adhoc"
def subFolder = "${rootFolder}/2-scripting-with-jenkins"

folder("${rootFolder}") {
    description('adhoc folder')
}

folder("${subFolder}") {
    description('adhoc folder')
}

jobMap.each { job ->
    //Create nexus job
    jenkinsJob( "${subFolder}/$job.key","$job.value","github_personal","Jenkinsfile")
}
