# cs108


submission web application

+ Students are now able to directly submit project directory in the web client who handles zipping files automatically
+ Ability to choose to submit their own ZIP files (older version)
+ Files are filtered according to the submit event (test , etape , bonus ..)


Final build in `Build` folder (ready to deploy : cannot be tested locally without a local server To test do the following steps)



Steps to run the project (dev mode) :
 
 1. import build 
 2. npm install 
 3. sbt -> fastLinkJS
 4. change the name of the second field in `snowpack.config.json` to "target/scala-2.13/`name_of_the_root_folder`-fastopt"
 5. npx snowpack dev
 6. cd test_backend
 7. node app.js
 
 
 (step 6 and 7 to test regex feature)
 
Steps to build the project : 
  npx snowpack build
  
  
  NOTE : 
  
 -token validation currently working with another simple API (server returning same response plus a regexList added in `event`) 
 replace `localhost:3000` with `s"$apiBaseURL/token/$tokenKey"`
 code of API in test_backend
 
 -Option for selecting a directory and zipping inside the webClient requires the support for webkitDirectory(supported by all recent browsers) and webkitRelativePath
 (not supoorted by Opera 77 and older  and IE 11 and older )
 more details here : https://caniuse.com/?search=webkitRelativePath  
                     https://caniuse.com/?search=webkitdirectory
                     
 -zipping is done with zip.js bundled inside Scala.js using snowpack and scalablytyped 
 snowpack : to be able to run npm modules with scala.js
 scalablytyped : to create facades for npm modules
 
 see documentation here : https://www.snowpack.dev/
                          https://scalablytyped.org/docs/readme.html
                          
                          
 Ideas: 
 -Unzip uploaded zip File and keep only needed files
 
 
