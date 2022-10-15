import React, { useState } from 'react'
import ButtonComp from '../ButtonComp/ButtonComp'
import './CounterComp.css'



const plusIcon = <i className="fa fa-plus" aria-hidden="true"></i>
const minusIcon = <i className="fa fa-minus" aria-hidden="true"></i>

function CounterComp() {
  const [count, setCount] = useState(0);

  const onPlusClickEvent = () => {
    setCount(count+1);
  }

  const onMinusClickEvent = () => {
    setCount(count-1);
  }


  return (
    <div className='counter'>
        <h1>Counter App</h1>
        <div className='number-count'>{ count }</div>
        <div className="buttons">
          <ButtonComp onClickEvent={ onPlusClickEvent } icon={ plusIcon } />
          <ButtonComp onClickEvent={ onMinusClickEvent } icon={ minusIcon } />
        </div>
    </div>
  )
}

export default CounterComp