async function getShow() {
   const show = document.getElementById("showName");
   const desc = document.getElementById("showDesc");
   const image = document.getElementById("pic");
  try {
    const call = await fetch("http://localhost:8080/shows/all");
    const callJSON = await call.json();
    console.log(callJSON);

    const randomNumber = Math.floor(Math.random() * 10);
    const randomShow = callJSON[randomNumber];

   
    show.innerText = randomShow.name;
    desc.innerText = randomShow.description;
    image.setAttribute("src", `${randomShow.url}`);

  } catch (e) {
    console.log("oops" + e.message);
  }
}

const button = document.getElementById("button");
button.addEventListener("click", getShow);
