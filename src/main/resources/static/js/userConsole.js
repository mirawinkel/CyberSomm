async function FindUsers() {
    const response = await fetch('http://localhost:8080/admin/allUsers');
    const results = await response.json();
    for await (let result of results) {
        if(result.email == "mymirareflection@gmail.com") {
            continue;
        }
        let item = "Name: " + result.username + ",  Email:" + result.email
        resultList.push(item);
    }

    await ShowConsoleList(resultList);
}
FindUsers();