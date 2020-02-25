# MyStoreHybris

# HOT SWAP
Follow the instructions inside:
https://dmitrykrivenko.blogspot.com/2017/03/hotswap-configuration-for-hybris.html

Add to local.properties next line:
tomcat.debugjavaoptions=-XXaltjvm=dcevm -Xdebug -Xnoagent -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=n -javaagent:${platformhome}/resources/hotswap/hotswap-agent-1.3.1-SNAPSHOT.jar=disablePlugin=Log4j2,disablePlugin=Spring,disablePlugin=Proxy,disablePlugin=AnonymousClassPatch,disablePlugin=ZK

Where jar is placed in \bin\platform\hotswap

ant clean all/hybrisserverstart.bat debug
