"use client";
import { useEffect, useState } from "react";
import Link from "next/link";

export default function Home() {
  const [data, setData] = useState("");

  async function loadData() {
    const data = await fetch("/api/hello").then((res) => res.json());
    setData(data);
  }

  return (
    <div>
      nextapp + spring boot2
      <button className={"btn btn-blue"} onClick={loadData}>
        Load data
      </button>
      <pre>{JSON.stringify(data, null, " ")}</pre>
    </div>
  );
}
