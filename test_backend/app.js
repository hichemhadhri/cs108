const express = require('express')
const app = express()
var cors = require('cors')
const port = 3000


app.use(cors())

app.get('/', (req, res) => {
  res.json(
    {key:"fo9OhF6w",
    owners:[{key:300434,lastName:"Hadri",firstName:"Hichem",email:"mohamed.hadhri@epfl.ch"}],
    event:{key:"stage12",description:"test du client",validFrom:1627358400,validTo:1628891999,gitBranch:"master",maxFileSize:5000
, regex : ["\\D*\\/src\\/ch\\/.*.java","\\D*.pdf"]
}}
  )
})

app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})