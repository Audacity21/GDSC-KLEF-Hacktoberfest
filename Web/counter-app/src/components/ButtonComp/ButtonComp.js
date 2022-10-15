import React from 'react'
import './ButtonComp.css'

function ButtonComp({ onClickEvent, icon }) {
  return (
    <button className='button' onClick={ onClickEvent }>{ icon }</button>
  )
}

export default ButtonComp