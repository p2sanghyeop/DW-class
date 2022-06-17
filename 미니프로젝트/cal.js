const date = new Date();

const viewYear = date.getFullYear();
const viewMonth = date.getMonth();

document.querySelector('.year-month').textContent =  `${viewYear}년 ${viewMonth + 1}월`;

const presList = new Date(viewYear, viewMonth, 0);
const thisList = new Date(viewYear, viewMonth+1, 0);

const PLDate = presList.getDate();
const PLDay = presList.getDay();

const TLDate = thisList.getDate();
const TLDay = thisList.getDay();

const preDates = []
const thisDates = []
const nextDates = []