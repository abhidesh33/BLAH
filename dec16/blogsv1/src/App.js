import BlogDetails from './pages/blogDetails'
import CreateBlog from './pages/createBlog'
import Home from './pages/home'
import Login from './pages/login'
import Profile from './pages/profile'
import Signup from './pages/signup'
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'

function App() {
  return (
    <div>
      <h1>My Blog Application</h1>

      <BrowserRouter>
        <ul>
          <li>
            <Link to="/login">Login</Link>
          </li>
          <li>
            <Link to="/signup">Signup</Link>
          </li>
          <li>
            <Link to="/home">home</Link>
          </li>
          <li>
            <Link to="/create-blog">create blog</Link>
          </li>
          <li>
            <Link to="/blog-details">blog details</Link>
          </li>
          <li>
            <Link to="/profile">profile</Link>
          </li>
        </ul>

        <Routes>
          <Route path="/login" element={<Login />} />
          <Route path="/signup" element={<Signup />} />
          <Route path="/create-blog" element={<CreateBlog />} />
          <Route path="/blog-details" element={<BlogDetails />} />
          <Route path="/profile" element={<Profile />} />
          <Route path="/home" element={<Home />} />
        </Routes>
      </BrowserRouter>
    </div>
  )
}

export default App
