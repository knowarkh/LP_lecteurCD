###################
#PROJET LECTEUR CD#
###################

Arnaud COLLET

---COMPTE RENDU---



---COMMANDES DOS---

---Se placer dans ws---

cd C:\Users\stuff\Documents\renduUE9\projLecteurCD\ws

---Compilation---

//Sans paquetage
javac -d %CLASSPATH% ../src/Duree.java
javac -d %CLASSPATH% ../src/DureeTest.java

//Avec paquetage
javac -d %CLASSPATH% ../src/datas/Duree.java
javac -d %CLASSPATH% ../src/datas/DureeTest.java

javac -d %CLASSPATH% ../src/datas/Plage.java
javac -d %CLASSPATH% ../src/datas/PlageTest.java

javac -d %CLASSPATH% ../src/datas/CD.java
javac -d %CLASSPATH% ../src/datas/CDTest.java

javac -d %CLASSPATH% ../src/datas/LecteurCD.java
javac -d %CLASSPATH% ../src/datas/LecteurCDTest.java

javac -d %CLASSPATH% ../src/ihm/FramLectCD.java ../src/control/MyMouseListener.java 

---Execution---

//Sans paquetage
java Duree
java DureeTest

//Avec paquetage
java datas.Duree
java datas.DureeTest

java datas.Plage
java datas.PlageTest

java datas.CD
java datas.CDTest

java ihm.FramLectCD

---Générer javaDoc---

javadoc -d ../javaDoc ../src/datas/*.java -private -author -charset -UTF8
javadoc -d ../javaDoc ../src/ihm/*.java -private -author 
javadoc -d ../javaDoc ../src/control/*.java -private -author