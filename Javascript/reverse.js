function reverseWords() {
	const str = 'This is a sunny day';

	const words = str.split(' ');

	const reverse = words.map(word => {
		return word.split('').reverse().join('');
	});
const reverseString = reverse.join(' ');

	console.log(reverseString);
}
reverseWords();
