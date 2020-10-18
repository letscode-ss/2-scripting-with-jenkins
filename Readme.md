# 2-scripting-with-jenkins

In this repo I jenkins pipeline which perform workstation cleenup post build execution.

[Jenkinsfile To generate jobs for testing](Jenkinsfile)<br/>

[web-hello-world/Jenkinsfile To run the pipeline](web-hello-world/Jenkinsfile)<br/>

[web-hello-world/cleanup-workspaces.groovy Workspace cleanup script](web-hello-world/cleanup-workspaces.groovy)<br/>


## Pipeline logs
```
Running on node-01 in /Users/testusr/jenkins_docker_home/node-01/workspace/job-1
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Checkout SCM)
[Pipeline] checkout
using credential github_personal
Cloning the remote Git repository
Cloning repository https://github.com/letscode-ss/2-scripting-with-jenkins.git
 > git init /Users/testusr/jenkins_docker_home/node-01/workspace/job-1 # timeout=10
Fetching upstream changes from https://github.com/letscode-ss/2-scripting-with-jenkins.git
 > git --version # timeout=10
using GIT_ASKPASS to set credentials 
 > git fetch --tags --progress -- https://github.com/letscode-ss/2-scripting-with-jenkins.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git config remote.origin.url https://github.com/letscode-ss/2-scripting-with-jenkins.git # timeout=10
 > git config --add remote.origin.fetch +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git config remote.origin.url https://github.com/letscode-ss/2-scripting-with-jenkins.git # timeout=10
Fetching upstream changes from https://github.com/letscode-ss/2-scripting-with-jenkins.git
using GIT_ASKPASS to set credentials 
 > git fetch --tags --progress -- https://github.com/letscode-ss/2-scripting-with-jenkins.git +refs/heads/*:refs/remotes/origin/* # timeout=10
Checking out Revision 1b5f6ef6d8239166d2c69b5d90430c770c4fcd8b (origin/master)
Commit message: "updating"
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
 > git rev-parse origin/master^{commit} # timeout=10
 > git config core.sparsecheckout # timeout=10
 > git checkout -f 1b5f6ef6d8239166d2c69b5d90430c770c4fcd8b # timeout=10
[Pipeline] stage
[Pipeline] { (gradle build)
[Pipeline] script
[Pipeline] {
[Pipeline] sh
+ cd web-hello-world
+ gradle build
> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes
> Task :war
> Task :assemble
> Task :compileTestJava
> Task :processTestResources NO-SOURCE
> Task :testClasses

> Task :test

org.gradle.examples.web.ServletTest > testDoGetServlet STANDARD_OUT
    Result for /hello: hello, world

> Task :check
> Task :build

BUILD SUCCESSFUL in 1s
4 actionable tasks: 4 executed
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Generating 100 MB)
[Pipeline] script
[Pipeline] {
[Pipeline] sh
+ dd if=/dev/zero of=testfile bs=1024 count=102400
102400+0 records in
102400+0 records out
104857600 bytes transferred in 0.911404 secs (115050608 bytes/sec)
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Declarative: Post Actions)
[Pipeline] script
[Pipeline] {
[Pipeline] load
[Pipeline] { (web-hello-world/cleanup-workspaces.groovy)
[Pipeline] echo
node: node-01, free space: 187GB
[Pipeline] echo
.. job adhoc is currently running, skipped
[Pipeline] echo
.. wiping out workspaces of job erregereger
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/erregereger
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/erregereger
[Pipeline] echo
.. wiping out workspaces of job job-1
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-1
[Pipeline] echo
.... deleted from location /Users/testusr/jenkins_docker_home/node-01/workspace/job-1
[Pipeline] echo
.. wiping out workspaces of job job-10
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-10
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-10
[Pipeline] echo
.. wiping out workspaces of job job-2
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-2
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-2
[Pipeline] echo
.. wiping out workspaces of job job-3
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-3
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-3
[Pipeline] echo
.. wiping out workspaces of job job-4
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-4
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-4
[Pipeline] echo
.. wiping out workspaces of job job-5
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-5
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-5
[Pipeline] echo
.. wiping out workspaces of job job-6
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-6
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-6
[Pipeline] echo
.. wiping out workspaces of job job-7
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-7
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-7
[Pipeline] echo
.. wiping out workspaces of job job-8
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-8
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-8
[Pipeline] echo
.. wiping out workspaces of job job-9
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/job-9
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/job-9
[Pipeline] echo
.. job king-test is currently running, skipped
[Pipeline] echo
.. wiping out workspaces of job lighthouse-scan
[Pipeline] echo
.... workspace = /Users/testusr/jenkins_docker_home/node-01/workspace/lighthouse-scan
[Pipeline] echo
.... nothing to delete at /Users/testusr/jenkins_docker_home/node-01/workspace/lighthouse-scan
[Pipeline] }
[Pipeline] // load
[Pipeline] }
[Pipeline] // script
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
```
