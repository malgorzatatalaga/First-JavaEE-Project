<%--
  Created by IntelliJ IDEA.
  User: gosia
  Date: 04/04/2023
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Compound interest calculator</title>
    <link href="project.css" rel="stylesheet">
</head>
<body class="bg-blue">
<div>
  <div class="mx-auto my-96 w-1/2 max-w-2xl rounded-3xl bg-white py-5 text-center shadow-xl font-thin">
    <h2 class="mx-6 border-b pb-2 text-4xl font-thin">Compound Interest Calculator</h2>
    <h3 class="bg-red-300 text-red-900 font-semibold text-xl w-80 rounded-lg my-2 mx-auto">${error}</h3>
    <form action="/calculate" method="post">
      <div class="mx-8 my-5 grid grid-cols-2 gap-4">
        <label for="principal" class="flex items-center text-xl">Principal: <span class="text-gray-600 mx-1">$</span></label>
        <input class="w-full appearance-none rounded-lg border-2 p-1 placeholder-blue-700 focus:outline-none" id="principal" type="number" min="1" name="principal" value="${principal}" />

        <label for="interest" class="flex items-center text-xl">Annual Rate:</label>
        <input class="w-full appearance-none rounded-lg border-2 p-1 placeholder-blue-700 focus:outline-none" id="interest" type="number" min="1" name="interest" value="${interest}" />

        <label for="time" class="flex items-center text-xl">Time (Years):</label>
        <input class="w-full appearance-none rounded-lg border-2 p-1 placeholder-blue-700 focus:outline-none" id="time" type="number" min="1" name="time" value="${time}" />

        <label for="compound" class="flex items-center text-xl">Compound:</label>
        <input class="w-full appearance-none rounded-lg border-2 p-1 placeholder-blue-700 focus:outline-none focus:ring-2" id="compound" type="number" min="1" name="compound" value="${compound}" />
      </div>
      <button class="rounded-lg bg-button px-4 py-1 text-xl font-thin hover:bg-blue-800 hover:text-white" type="submit">Calculate</button>
      <p class="font-mono text-3xl text-color">Result: ${result}</p>
    </form>
  </div>
</div>
</body>
</html>
