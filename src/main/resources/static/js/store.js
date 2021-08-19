const cityList = document.getElementById("cityList");
const vintage = document.getElementById("vintage");
const resultBox = document.getElementById("resultBox")
async function makeCityList() {
    const response = await fetch('http://localhost:8080/allVendors');
    const results = await response.json();
    let doubleFinder = [];
    for await (let vendor of results) {
        if (!doubleFinder.includes(vendor.city)) {
            let option = document.createElement("option");
            option.innerHTML = vendor.city;
            option.value = vendor.city;
            cityList.appendChild(option);
            doubleFinder.push(vendor.city);
        }
    }
}
async function findVendorByCity(city) {
    const response = await fetch('http://localhost:8080/vendorCity?city=' + city);
    const results = await response.json();
    return results;
}

async function generateResults() {
    let currentVintage = vintage.value;
    let currentCity = cityList.value;
    if (currentVintage != null && currentCity != null) {
        let vendorByCity = await findVendorByCity();
        for await (let vendor of vendorByCity) {
            for (let wine of vendor.wineList) {
                if(wine.vintage == currentVintage) {
                    let element = document.createElement("div")
                    element.innerHTML = wine.producer + " " + wine.name + " " + wine.vintage + " " + wine.region + "  $" + wine.price;
                    resultBox.appendChild(element);
                }
            }
        }
    } else if (currentVintage != null) {

    }
}

makeCityList();

