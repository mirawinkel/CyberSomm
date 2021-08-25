async function FindVendors() {
    resultList = [];
    const response = await fetch('http://localhost:8080/allVendors');
    const results = await response.json();
    for await (let result of results) {
        let item = "Id: " + result.id + ",  Name: " + result.name + ",  City: " + result.city + ", State: " + result.state + ", Country: " + result.country;
        resultList.push(item);
    }

    await ShowConsoleList(resultList);
}

FindVendors();
