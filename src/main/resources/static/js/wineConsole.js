async function FindWines() {
    resultList = [];
    const response = await fetch('http://localhost:8080/allWines');
    const results = await response.json();
    for await (let result of results) {
        let item = "Id: " + result.id + ",  Name: " + result.name + ",  Producer: " + result.producer + ", Vintage: " + result.vintage + ", Varietal: " + result.varietal + ", Region: " + result.region + ", Country: " + result.country + ", Price: " + result.price + ", Cost: " + result.cost;
        resultList.push(item);
    }
    await ShowConsoleList(resultList);
}
document.getElementById("update").setAttribute("checked","checked")
FindWines();