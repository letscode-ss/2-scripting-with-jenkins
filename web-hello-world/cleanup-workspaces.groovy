import hudson.model.*;
import hudson.util.*;
import jenkins.model.*;
import hudson.FilePath.FileCallable;
import hudson.slaves.OfflineCause;
import hudson.node_monitors.*;

/*
for (node in Jenkins.instance.nodes) {
    computer = node.toComputer()
    if (computer.getChannel() == null) continue

    rootPath = node.getRootPath()
    size = DiskSpaceMonitor.DESCRIPTOR.get(computer).size
    roundedSize = size / (1024 * 1024 * 1024) as int
    
    println("node: " + node.getDisplayName() + ", free space: " + roundedSize + "GB")
    if (roundedSize < 10) {
      try {
        computer.setTemporarilyOffline(true, new hudson.slaves.OfflineCause.ByCLI("disk cleanup"))
        for (item in Jenkins.instance.items) {
            jobName = item.getFullDisplayName()
            if (item instanceof com.cloudbees.hudson.plugins.folder.Folder || item instanceof jenkins.branch.OrganizationFolder ) {
                println("cleanup: job " + jobName + " is currently running, skipped")
                continue
            }

            println(".. wiping out workspaces of job " + jobName)

            workspacePath = node.getWorkspaceFor(item)
            if (workspacePath == null) {
                println("cleanup: could not get workspace path")
                continue
            }

            println("cleanup: workspace = " + workspacePath)

            pathAsString = workspacePath.getRemote()
            if (workspacePath.exists()) {
                workspacePath.deleteRecursive()
                println("cleanup: deleted from location " + pathAsString)
            } else {
                println("cleanup: nothing to delete at " + pathAsString)
            }
        }
      } finally {
        computer.setTemporarilyOffline(false, null)
      }
    }
}
*/

def cleanup(node_name) {
    println("Yes node name is ${node_name}")
}