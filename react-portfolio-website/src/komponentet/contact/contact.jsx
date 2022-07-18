import React from "react";
import "./contact.css"
import {MdOutlineEmail } from 'react-icons/md'
import {BsMessenger} from 'react-icons/bs'
import {BsWhatsapp} from 'react-icons/bs'
import  { useRef } from 'react';
import emailjs from 'emailjs-com';


const Contact =()=>{
    const form =useRef();
    const sendEmail = (e) => {
        e.preventDefault();
    
        emailjs.sendForm('service_wgxz6k6', 'template_lcxjowc', form.current, 'gk1d3I0tlmGG6jfM1')
        e.target.reset()
          .then((result) => {
              console.log(result.text);
          }, (error) => {
              console.log(error.text);
          });
      };
    return(
<section id="contact">
   <h5>Get in Touch</h5>
   <h2>Contact Me</h2>


<div className="container contact_container">
    <div className="contact">
        <article className="contact_item">
         <i className=""><MdOutlineEmail /></i>
            <h4>Email</h4>
            <h5>karaxadardan@gmail.com</h5>
            <a href="mailto:karaxhadardan@gmail.com">Send a message</a>
        </article>
        <article className="contact_item">
         <i className=""><BsMessenger /></i>
            <h4>Messenger</h4>
            <h5>Dardan Karaxha</h5>
            <a href="https://m.me/dardan.karaxha.1"target="_blank">Send a message</a>
        </article>
        <article className="contact_item">
         <i className=""><BsWhatsapp /></i>
            <h4>Whatsapp</h4>
            <h5>+383 49 562 087</h5>
            <a href="https://api.whatsapp.com/send?phone+38349562087" target="_blank">Send a message</a>
        </article>
    </div>
    <form ref={form} onSubmit={sendEmail}>
        <input type="text"name="name"placeholder="Full Name"required />
        <input type="email"name="email"placeholder="Your Email"required />
        <textarea name="message"rows="7"placeholder="Message"required></textarea>
        <button type="submit"className="btn btn-primary">Send Message</button>
    </form>
</div>
</section>
    )
}

export default Contact