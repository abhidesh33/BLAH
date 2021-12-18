const mysql = require('mysql')
const mysql2 = require('mysql2/promise')

const openConnection = () => {
  const connection = mysql.createConnection({
    port: 3306,
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'blogs_db',
  })

  connection.connect()

  return connection
}

const openConnection2 = async () => {
  const connection = await mysql2.createConnection({
    port: 3306,
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'blogs_db',
  })

  return connection
}

module.exports = {
  openConnection,
  openConnection2,
}
