// by deafult, events are propagated through whats called bubbling

// capturing works from the outside, so the parent node of the dom, down through the dom,
// to the element that initially fired the event

// we can set capturing to true by passing true as an argument in the addEventListener
// function

window.addEventListener("load", function () {
  document.getElementById("div2").addEventListener("click", () => {
    console.log("You clicked on div 2");
  });

  document.getElementById("div1").addEventListener(
    "click",
    () => {
      console.log("You clicked on div 1");
    },
    true
  );
});
