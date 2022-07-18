import React from "react";
import "./about.css"
import Me from '../../asetet/dardi.jpg'




const About = () =>{

    return(

<section id="about">

<h5>Get to Know</h5>
<h2>About Me</h2>
<div className="container about__container">

    <div className="about_me">
        <div className="about_me-image">
            <img src={Me} alt="About Image" />
        </div>
    </div>
<div className="teksti">
<p>I'm Dardan Karaxha and I'm 22 years old,on this year I just finished the university for Computer Science in University Ukshin Hoti-Prizren,degree:Bachelor</p>
<a href="#contact"className="btn btn-primary">Let's talk</a>
</div>

</div>
    </section>

        )
}

export default About