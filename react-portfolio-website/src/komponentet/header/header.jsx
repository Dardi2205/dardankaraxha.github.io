import React from 'react'
import "./header.css"
import Cta from './cta'

import Me from '../../asetet/me.png'
import HeaderSocial from './HeaderSocial'


const Header = () => {
  return (
 <header>

<div className='koka koka__zgjerimi'>
<h5>Hello I'm</h5>
<h1>Dardan Karaxha</h1>
<h1 className="text-light">Front End Developer</h1>

<Cta />
<HeaderSocial />
<div className='une'>
  <img src={Me} alt=""/>
</div>
<a href="#contact" className='scroll_down'>My Portfolio</a>
</div>


  </header>
  )
}

export default Header
