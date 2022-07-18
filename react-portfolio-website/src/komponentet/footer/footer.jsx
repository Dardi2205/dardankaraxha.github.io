import React from 'react'
import "./footer.css"
import{BsFacebook} from 'react-icons/bs'
import {BsInstagram} from 'react-icons/bs'
import {BsGithub} from 'react-icons/bs'
const Footer = () => {
  return (
 <footer>

<a href="#"className="footer_logo">Dardan Karaxha</a>

<ul className="permalinket">

  <li><a href="#">Home</a></li>
  <li><a href="#about">About</a></li>
  <li><a href="#experience">Exsperience</a></li>
  <li><a href="#services">Service</a></li>
  <li><a href="#">Portfolio</a></li>
  <li><a href="#contact">Contact</a></li>

</ul>
<div className="footer_social">

  <a href="https://facebook.com"><BsFacebook /></a>
  <a href="https://instagram.com"><BsInstagram /></a>
  <a href="https://github.com"><BsGithub /></a>
</div>
<div className="footer_copyright">
<small>&copy; by Dardan Karaxha.All Rights Rezerved</small>
</div>
</footer>

  )
}

export default Footer
