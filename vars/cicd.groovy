
def newDownload(repo)
{
git "https://github.com/sairsm/${repo}"
}
def newBuild()
{
  sh 'mvn package'
}
def newDeploy(jobname,ip,appname)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@172.31.2.205:/var/lib/tomcat9/webapps/testapp.war"
}
