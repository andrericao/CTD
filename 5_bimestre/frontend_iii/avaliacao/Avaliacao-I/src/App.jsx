import { useState } from 'react'
import './App.css'
import Page from './components/Page';

export default function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Page />
    </>
  )
}