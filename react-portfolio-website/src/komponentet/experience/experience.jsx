import React from 'react'
import "./experience.css"
import {AiFillHtml5} from 'react-icons/ai'
import {DiCss3} from 'react-icons/di' 
import {TbBrandJavascript} from 'react-icons/tb'
import {BsBootstrap} from 'react-icons/bs'
import {DiReact} from 'react-icons/di'
import {SiTailwindcss} from 'react-icons/si'
import {FaJava} from 'react-icons/fa'
import {SiPhp} from 'react-icons/si'
import {SiMysql} from 'react-icons/si'
const Experience = () => {
  return (
  <section id="experience">



<h5>What Skills do I have</h5>
<h2>My Experience</h2>

<div className='experience_grid'>

  <div className='borderi'>
<div className='teksti'>
<h4>Frontend Development</h4>
<div className='listakryesore'>
<div className='lista'>
<i className=''><AiFillHtml5 /></i>
<div className='tekstimprapa'>
<h4>HTML</h4>
<small>Experienced</small>
</div>
</div>
<div className='lista'>
<i className=''><DiCss3 /></i>
<div className='tekstimprapa'>
<h4>CSS</h4>
<h5>Intermidiate</h5>
</div>
</div>
<div className='lista'>
<i className=''><TbBrandJavascript /></i>
<div className='tekstimprapa'>
<h4>JS</h4>
<h5>Intermidiate</h5>
</div>
</div>
<div className='lista'>
<i className=''><BsBootstrap/> </i>
<div className='tekstimprapa'>
<h4>Bootstrap</h4>
<h5>Beginner</h5>
</div>
</div>
<div className='lista'>
<i className=''><DiReact /></i>
<div className='tekstimprapa'>
<h4>React Js</h4>
<h5>Beginner</h5>
</div>
</div>
<div className='lista'>
<i className=''><SiTailwindcss /></i>
<div className='tekstimprapa'>
<h4>Tailwind CSS</h4>
<h5>Beginner</h5>
</div>
</div>
</div>


</div>

  </div>
  <div className='borderi'>
<div className='teksti'>
  <h4>Backend Development</h4>
</div>

<div className='listakryesore'>
<div className='lista'>
<i className=''><FaJava /></i>
<div className='tekstimprapa'>
<h4>Java</h4>
<small>Experienced</small>
</div>
</div>
<div className='lista'>
<i className=''><SiPhp /></i>
<div className='tekstimprapa'>
<h4>PHP</h4>
<h5>Beginner</h5>
</div>
</div>
<div className='lista'>
<i className=''><SiMysql /></i>
<div className='tekstimprapa'>
<h4>Mysql</h4>
<h5>Intermidiate</h5>
</div>
</div>

</div>
  </div>
</div>
    </section>
  )
}

export default Experience
