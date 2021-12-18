// require:
// - load the module
// - it requires the path of the module
const express = require('express')
const cors = require('cors')
const routerUser = require('./routes/user')
const routerBlog = require('./routes/blog')
const routerComment = require('./routes/comment')
const routerRating = require('./routes/rating')

const app = express()

// enable CORS (Cross Origin Resource Sharing)
// needed for client to call the apis from different url
app.use(cors('*'))

// add the json parser to parse the json data sent through
// the request body
app.use(express.json())

// use the router to find all the apis related to the user
app.use('/user', routerUser)

// use the router to find all the apis related to the blogs
app.use('/blog', routerBlog)

// use the router to find all the apis related to the comment
app.use('/comment', routerComment)

// use the router to find all the apis related to the rating
app.use('/rating', routerRating)

app.listen(4000, () => {
  console.log(`server started on port 4000`)
})
